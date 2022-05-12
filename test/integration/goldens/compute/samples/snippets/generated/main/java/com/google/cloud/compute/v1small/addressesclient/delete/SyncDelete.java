/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.compute.v1small.samples;

// [START compute_v1small_generated_addressesclient_delete_sync]
import com.google.cloud.compute.v1small.AddressesClient;
import com.google.cloud.compute.v1small.DeleteAddressRequest;
import com.google.cloud.compute.v1small.Operation;

public class SyncDelete {

  public static void main(String[] args) throws Exception {
    syncDelete();
  }

  public static void syncDelete() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (AddressesClient addressesClient = AddressesClient.create()) {
      DeleteAddressRequest request =
          DeleteAddressRequest.newBuilder()
              .setAddress("address-1147692044")
              .setProject("project-309310695")
              .setRegion("region-934795532")
              .setRequestId("requestId693933066")
              .build();
      Operation response = addressesClient.deleteAsync(request).get();
    }
  }
}
// [END compute_v1small_generated_addressesclient_delete_sync]