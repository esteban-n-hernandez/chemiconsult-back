package org.chemiconsult.api.customer.impl;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.chemiconsult.api.customer.to.CustomerTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

public interface ICustomerController {

    @ApiOperation(value = "Post form information into database.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Form registered."),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Authentication Error"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @PostMapping(value = "/create", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity createCustomer(CustomerTO customer);


    @ApiOperation(value = "Post form information into database.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Form registered."),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Authentication Error"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @DeleteMapping(value = "/delete", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity deleteCustomer(CustomerTO customer);

    @ApiOperation(value = "Post form information into database.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Form registered."),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Authentication Error"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @PutMapping(value = "/update", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity updateCustomer(CustomerTO customer);

    @ApiOperation(value = "Post form information into database.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Form registered."),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Authentication Error"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @GetMapping(value = "/get-customers", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity getAllCustomers();

    @ApiOperation(value = "Post form information into database.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Form registered."),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Authentication Error"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @GetMapping(value = "/{documentNumber}", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity getCustomer(Integer documentNumber);

}
