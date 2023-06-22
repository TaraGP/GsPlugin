package org.Ivoyant;

import org.Ivoyant.model.Schedule;
import org.Ivoyant.model.ScheduleState;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.plugins.annotations.ResolutionScope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.Ivoyant.service.ScheduleImpl;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

@Mojo(name="Gs-plugin", requiresProject = false, requiresDependencyResolution = ResolutionScope.NONE)
public class GSMojo extends AbstractMojo {
    static final Logger logger = LoggerFactory.getLogger(GSMojo.class);

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {}}

//    @Parameter(property="scheduleZoneId")
//    private String scheduleZoneId;
//    @Parameter(property="scheduleId")
//    private int scheduleId ;
//    @Parameter(property="scheduleName")
//    private  String scheduleName;
//    @Parameter(property="description")
//    private String scheduleDescription ;
//    @Parameter(property="target")
//    private String scheduleTarget ;
//    @Parameter(property="active")
//    private boolean scheduleActive=false;
//    @Parameter(property="targetType")
//    private  String scheduleTargetType;
//    @Parameter(property="cron_expression")
//    private String  scheduleCron_expression;
//    @Parameter(property="createdTime")
//    private  Date scheduleCreatedRun;
//    @Parameter(property="lastRun")
//    private Date scheduleLastRun ;
//    @Parameter(property="nextRun")
//    private Date scheduleNextRun;
//    @Parameter(property="state")
//    private ScheduleState scheduleState;
//
//    @Parameter(property = "databaseUrl")
//    private String databaseUrl = "jdbc:postgresql://localhost:5432/postgres";
//
//    @Parameter(property = "databaseUsername")
//    private String databaseUsername = "postgres";
//
//    @Parameter(property = "databasePassword")
//    private String databasePassword = "password";

//    static final Logger logger = LoggerFactory.getLogger(GSMojo.class);
//
//    @Override
//    public void execute() throws MojoExecutionException, MojoFailureException {
////        try (Connection connection = DriverManager.getConnection(databaseUrl, databaseUsername, databasePassword)) {
//            JdbcTemplate jdbcTemplate = null;
//            ScheduleImpl scheduleImpl = new ScheduleImpl(jdbcTemplate);
//
//            if (scheduleId != 0) {
//                // Retrieve a job by ID
//                Schedule schedule = scheduleImpl.getSchedule(scheduleId);
//                if (schedule != null) {
//                    getLog().info("Retrieved Schedule: " + schedule.toString());
//                } else {
//                    getLog().info("Job with ID " + scheduleId + " not found.");
//                }
//            }
//            else
//            {
//                // Create a new job
//                Schedule newJob = new Schedule();
//                newJob.setScheduleId(scheduleId);
//                newJob.setName(scheduleName);
//                newJob.setDescription(scheduleDescription);
//                newJob.setActive(scheduleActive);
//                newJob.setCron_expression(scheduleCron_expression);
//                newJob.setState(ScheduleState.CREATED);
//                newJob.setTarget(scheduleTarget);
//                newJob.setTargetType(scheduleTargetType);
//                newJob.setZoneId(scheduleZoneId);
//                newJob.setCreatedTime(scheduleCreatedRun);
//                newJob.setLastRun(scheduleLastRun);
//                newJob.setNextRun(scheduleNextRun);
//
//                scheduleImpl.create(newJob);
//                getLog().info("New Job created: " + newJob.toString());
//            }
//        } catch (SQLException e) {
//            logger.error("Error executing GS-plugin: " + e);
//            throw new MojoExecutionException("Error executing GS-plugin", e);
//        }
//    }
//}
