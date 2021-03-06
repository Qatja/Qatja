package se.wetcat.qatja;

/*
 * Copyright (C) 2012 Andreas Goransson, David Cuartielles
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

/**
 * Defines the current MQTT version.
 * 
 * TODO: Find a better way of defining versions, defining a version should also
 * affect the other classes of the project - and the specific platform 
 * implementations.
 *
 * @author  Andreas Goransson
 * @version 1.0.0
 * @since   2017-05-07
 */
public class MQTTVersion {

    /**
     * MQTT 3.1 Version name
     */
    public static String NAME_31 = "MQIsdp";

    /**
     * MQTT 3.1 Version number
     */
    public static byte VERSION_31 = (byte) 0x03;

    /**
     * MQTT 3.1.1 Version name
     */
    public static String NAME_311 = "MQTT";

    /**
     * MQTT 3.1 Version number
     */
    public static byte VERSION_311 = (byte) 0x04;

}
