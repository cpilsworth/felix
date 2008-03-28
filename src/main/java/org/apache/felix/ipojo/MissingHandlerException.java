/* 
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.felix.ipojo;

import java.util.List;

/**
 * Missing Handler Exception.
 * This exception occurs when an handler is missing to build an instance.
 * @author <a href="mailto:dev@felix.apache.org">Felix Project Team</a>
 */
public class MissingHandlerException extends Exception {
    
    /**
     * Serialization Id. 
     */
    private static final long serialVersionUID = 5047792897590881478L;
    
    /**
     * Message. 
     */
    private String m_message;
    
    /**
     * Constructor.
     * @param missing : list of missing handlers.
     */
    public MissingHandlerException(List missing) {
        super();
        m_message = "Missing handlers : ";
        for (int i = 0; i < missing.size(); i++) {
            m_message += (String) missing.get(i) + " ";
        }
    }
    
    /**
     * Get the error message.
     * @return : the error message
     * @see java.lang.Throwable#getMessage()
     */
    public String getMessage() {
        return m_message;
    }

}
