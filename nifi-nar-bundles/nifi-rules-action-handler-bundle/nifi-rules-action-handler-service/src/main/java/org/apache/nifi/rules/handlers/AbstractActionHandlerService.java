/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.nifi.rules.handlers;

import org.apache.nifi.context.PropertyContext;
import org.apache.nifi.controller.AbstractControllerService;
import org.apache.nifi.rules.Action;
import org.apache.nifi.rules.PropertyContextActionHandler;

import java.util.Map;

public abstract class AbstractActionHandlerService extends AbstractControllerService implements PropertyContextActionHandler {

    public static enum DebugLevels {
        trace, debug, info, warn, error
    }
    public abstract void execute(Action action, Map<String, Object> facts);

    public void execute(PropertyContext context, Action action, Map<String, Object> facts) {
        execute(action, facts);
    }

}