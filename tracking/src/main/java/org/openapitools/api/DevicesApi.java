/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.3).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import com.leadville.lambda.client.model.Device;
import com.leadville.lambda.client.model.DeviceDetails;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-04T19:43:38.242+02:00[Africa/Cairo]")

@Validated
@Api(value = "devices", description = "the devices API")
public interface DevicesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /devices/ : Accepts pilot data to create account and register.
     * Register new pilot.
     *
     * @param device RegisterPilotPost request data. (optional)
     * @return pilot created (status code 201)
     *         or invalid input, object invalid (status code 400)
     *         or an existing item already exists (status code 409)
     */
    @ApiOperation(value = "Accepts pilot data to create account and register.", nickname = "createPilot", notes = "Register new pilot.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "pilot created"),
        @ApiResponse(code = 400, message = "invalid input, object invalid"),
        @ApiResponse(code = 409, message = "an existing item already exists") })
    @RequestMapping(value = "/devices/",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> _createPilot(@ApiParam(value = "RegisterPilotPost request data."  )  @Valid @RequestBody(required = false) Device device) {
        return createPilot(device);
    }

    // Override this method
    default  ResponseEntity<Void> createPilot(Device device) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /devices/pending : Accepts pilot .
     * Get pilot .
     *
     * @return item returned (status code 200)
     *         or invalid input, object invalid (status code 400)
     */
    @ApiOperation(value = "Accepts pilot .", nickname = "getPilot", notes = "Get pilot .", response = DeviceDetails.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "item returned", response = DeviceDetails.class),
        @ApiResponse(code = 400, message = "invalid input, object invalid") })
    @RequestMapping(value = "/devices/pending",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<DeviceDetails> _getPilot() {
        return getPilot();
    }

    // Override this method
    default  ResponseEntity<DeviceDetails> getPilot() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /devices/{id} : Accepts pilot id.
     * Get specific pilot .
     *
     * @param id pass an pilot id to get his data (required)
     * @return item returned (status code 200)
     *         or invalid input, object invalid (status code 400)
     */
    @ApiOperation(value = "Accepts pilot id.", nickname = "getPilotById", notes = "Get specific pilot .", response = Device.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "item returned", response = Device.class),
        @ApiResponse(code = 400, message = "invalid input, object invalid") })
    @RequestMapping(value = "/devices/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Device> _getPilotById(@ApiParam(value = "pass an pilot id to get his data",required=true) @PathVariable("id") Long id) {
        return getPilotById(id);
    }

    // Override this method
    default  ResponseEntity<Device> getPilotById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"frequentFlyer\" : true, \"flyingDetails\" : \"I've been flying for 5 years\", \"pilotPostId\" : 0, \"about\" : \"about me\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /devices/ : Accepts pilot data to update the account and compelete all details.
     * Update pilot.
     *
     * @param device UpdatePilotPost request data. (optional)
     * @return pilot updated (status code 201)
     *         or invalid input, object invalid (status code 400)
     *         or an existing item already exists (status code 409)
     */
    @ApiOperation(value = "Accepts pilot data to update the account and compelete all details.", nickname = "updatePilot", notes = "Update pilot.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "pilot updated"),
        @ApiResponse(code = 400, message = "invalid input, object invalid"),
        @ApiResponse(code = 409, message = "an existing item already exists") })
    @RequestMapping(value = "/devices/",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> _updatePilot(@ApiParam(value = "UpdatePilotPost request data."  )  @Valid @RequestBody(required = false) Device device) {
        return updatePilot(device);
    }

    // Override this method
    default  ResponseEntity<Void> updatePilot(Device device) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}