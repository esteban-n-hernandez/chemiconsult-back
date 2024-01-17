package org.chemiconsult.api.sample.impl;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.chemiconsult.api.sample.to.SampleTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

public interface ISampleController {

    @ApiOperation(value = "Post form information into database.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Form registered."),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Authentication Error"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @PostMapping(value="/create", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity createSample(@RequestBody SampleTO sample);


    @ApiOperation(value = "Post form information into database.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Form registered."),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Authentication Error"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @DeleteMapping(value = "/delete", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity deleteSample(SampleTO sample);

    @ApiOperation(value = "Post form information into database.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Form registered."),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Authentication Error"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @PutMapping(value = "/update", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity updateSample(SampleTO sample);

    @ApiOperation(value = "Post form information into database.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Form registered."),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Authentication Error"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @GetMapping(value = "/get-samples", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity getAllSamples();

    @ApiOperation(value = "Post form information into database.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Form registered."),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Authentication Error"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @GetMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity getSampleByID(Integer sampleID);

}
