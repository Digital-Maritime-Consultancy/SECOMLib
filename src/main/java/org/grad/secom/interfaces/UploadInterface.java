/*
 * Copyright (c) 2022 GLA Research and Development Directorate
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.grad.secom.interfaces;

import org.grad.secom.models.UploadRequest;
import org.grad.secom.models.UploadResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * The SECOM Upload Interface Definition.
 * </p>
 * This interface definition can be used by the SECOM-compliant services in
 * order to direct the implementation of the relevant endpoint according to
 * the specified SECOM standard version.
 *
 * @author Nikolaos Vastardis (email: Nikolaos.Vastardis@gla-rad.org)
 */
public interface UploadInterface {

    /**
     * The Interface Endpoint Path.
     */
    public static final String UPLOAD_INTERFACE_PATH = "/v1/object";

    /**
     * POST /v1/object : The interface shall be used for uploading (pushing)
     * data to a consumer. The operation expects one single data object and
     * its metadata.
     *
     * @param uploadRequest  the upload object
     * @return the upload response object
     */
    @PostMapping(UPLOAD_INTERFACE_PATH)
    ResponseEntity<UploadResponse> upload(@RequestBody UploadRequest uploadRequest);

}