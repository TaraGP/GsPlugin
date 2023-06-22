package org.Ivoyant.service;

import org.Ivoyant.model.Schedule;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
@RequestMapping("gs/api")
public interface ScheduleIn {

    @PostMapping("/createSchedule")
    public ResponseEntity createSchedule(@RequestBody Schedule schedule) throws SQLException;

    @GetMapping("/getSchedule/{id}")
    public ResponseEntity getScheduleById(@PathVariable int id) throws SQLException;

    @PutMapping("/updateSchedule")
    public ResponseEntity updateScheduleById(@RequestBody Schedule schedule) throws SQLException;

    @DeleteMapping("/deleteSchedule/{id}")
    public ResponseEntity deleteScheduleById(@PathVariable int id);

    @GetMapping("/getAllSchedule")
    public ResponseEntity getAllSchedule();

    @GetMapping("/getScheduleHistory/{id}")
    public ResponseEntity getScheduleHistory(@PathVariable int id) throws SQLException;

}
