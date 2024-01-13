package org.chemiconsult.api.methodology.impl;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.chemiconsult.api.methodology.to.MethodologyTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

public interface IMethodologyController {


    @ApiOperation(value = "Insert a methodology into database.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Form registered."),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Authentication Error"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @PostMapping(value = "/create", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity createMethodology(MethodologyTO methodology);


    @ApiOperation(value = "Delete a methodology.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Form registered."),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Authentication Error"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @DeleteMapping(value = "/delete", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity deleteMethodology(MethodologyTO methodology);

    @ApiOperation(value = "Update a methodology.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Form registered."),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Authentication Error"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @PutMapping(value = "/update", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity updateMethodology(MethodologyTO methodology);

    @ApiOperation(value = "Get all methodologys stored in DB.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Form registered."),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Authentication Error"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @GetMapping(value = "/get-methodologys", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity getAllMethodologys();

    @ApiOperation(value = "Get a methodology by ID.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Form registered."),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Authentication Error"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @GetMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity getMethodology(Integer id);

}
