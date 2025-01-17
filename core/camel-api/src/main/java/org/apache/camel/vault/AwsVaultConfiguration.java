/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.vault;

import org.apache.camel.spi.Metadata;

/**
 * Configuration for access to AWS Secret.
 */
public class AwsVaultConfiguration extends VaultConfiguration {

    @Metadata(secret = true)
    private String accessKey;
    @Metadata(secret = true)
    private String secretKey;
    @Metadata
    private String region;
    @Metadata
    private boolean defaultCredentialsProvider;

    public String getAccessKey() {
        return accessKey;
    }

    /**
     * The AWS access key
     */
    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    /**
     * The AWS secret key
     */
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getRegion() {
        return region;
    }

    /**
     * The AWS region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    public boolean isDefaultCredentialsProvider() {
        return defaultCredentialsProvider;
    }

    /**
     * Define if we want to use the AWS Default Credentials Provider or not
     */
    public void setDefaultCredentialsProvider(boolean defaultCredentialsProvider) {
        this.defaultCredentialsProvider = defaultCredentialsProvider;
    }

}
