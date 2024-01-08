package org.chemiconsult.api.controller.inter;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.chemiconsult.api.controller.to.FormTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

public interface IFormController {

    @ApiOperation(value = "Post form information into database.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Form registered."),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Authentication Error"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @PostMapping(value = "/create-form", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity createForm(@RequestBody FormTO form) throws Exception;

    public void deleteForm();

    public void updateForm();

    public void getForms();

    public void getForm();

}
