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
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The dataformat component is used for working with Data Formats as if it was a
 * regular Component supporting Endpoints and URIs.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DataFormatEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Data Format component.
     */
    public interface DataFormatEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedDataFormatEndpointBuilder advanced() {
            return (AdvancedDataFormatEndpointBuilder) this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default DataFormatEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default DataFormatEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Data Format component.
     */
    public interface AdvancedDataFormatEndpointBuilder
            extends
                EndpointProducerBuilder {
        default DataFormatEndpointBuilder basic() {
            return (DataFormatEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedDataFormatEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedDataFormatEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedDataFormatEndpointBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedDataFormatEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface DataFormatBuilders {
        /**
         * Data Format (camel-dataformat)
         * The dataformat component is used for working with Data Formats as if
         * it was a regular Component supporting Endpoints and URIs.
         * 
         * Category: core,transformation
         * Since: 2.12
         * Maven coordinates: org.apache.camel:camel-dataformat
         * 
         * Syntax: <code>dataformat:name:operation</code>
         * 
         * Path parameter: name (required)
         * Name of data format
         * 
         * Path parameter: operation (required)
         * Operation to use either marshal or unmarshal
         * The value can be one of: marshal, unmarshal
         */
        default DataFormatEndpointBuilder dataformat(String path) {
            return DataFormatEndpointBuilderFactory.dataformat(path);
        }
    }
    /**
     * Data Format (camel-dataformat)
     * The dataformat component is used for working with Data Formats as if it
     * was a regular Component supporting Endpoints and URIs.
     * 
     * Category: core,transformation
     * Since: 2.12
     * Maven coordinates: org.apache.camel:camel-dataformat
     * 
     * Syntax: <code>dataformat:name:operation</code>
     * 
     * Path parameter: name (required)
     * Name of data format
     * 
     * Path parameter: operation (required)
     * Operation to use either marshal or unmarshal
     * The value can be one of: marshal, unmarshal
     */
    static DataFormatEndpointBuilder dataformat(String path) {
        class DataFormatEndpointBuilderImpl extends AbstractEndpointBuilder implements DataFormatEndpointBuilder, AdvancedDataFormatEndpointBuilder {
            public DataFormatEndpointBuilderImpl(String path) {
                super("dataformat", path);
            }
        }
        return new DataFormatEndpointBuilderImpl(path);
    }
}