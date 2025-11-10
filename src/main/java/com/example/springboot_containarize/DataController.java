package com.example.springboot_containarize;


import org.springframework.web.bind.annotation.*;
import java.util.*;

    @CrossOrigin(origins = "http://localhost:3000")
    @RestController
    @RequestMapping("/api")
    public class DataController {


        // 1. GET method - simple greeting
        @GetMapping("/greet")
        public String greetUser(@RequestParam(defaultValue = "Guest") String name) {
            return "Hello " + name + ", welcome to the API!";
        }

        // 2. GET method - return list of sample items
        @GetMapping("/items")
        public List<String> getItems() {
            return Arrays.asList("Item1", "Item2", "Item3", "Item4");
        }

        // 3. PUT method - update data
        @PutMapping("/update")
        public String updateData(@RequestBody DataRequest request) {

            return "Data for " + request.getName() + " updated successfully!";
        }

        // 4. DELETE method - delete user by id
        @DeleteMapping("/delete/{id}")
        public String deleteUser(@PathVariable int id) {
            System.out.println("Deleting user with ID udivdhwkfcwdknf: " + id);
            return "User with ID " + id + " deleted successfully!";
        }

        // 5. PATCH method - partial update
        @PatchMapping("/patch")
        public String patchData(@RequestBody Map<String, Object> updates) {
            System.out.println("Patch request received: " + updates);
            return "Partial update applied cidsghcjhdwkhiheknd: " + updates;
        }
    }

}
 //comment1