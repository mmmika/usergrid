/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.usergrid.persistence.graph;


import org.apache.usergrid.persistence.graph.impl.SimpleMarkedEdge;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * An edge.  With the additional info of if it is marked for deletion
 *
 */
@JsonDeserialize(as = SimpleMarkedEdge.class)
public interface MarkedEdge extends Edge{

    /**
     * True if this edge is deleted, false otherwise
     * @return True if this version is marked as deleted
     */
    boolean isDeleted();

    /**
     * Return true if the source node is deleted
     * @return
     */
    boolean isSourceNodeDelete();

    /**
     * Return true if the target node is deleted
     * @return
     */
    boolean isTargetNodeDeleted();


}
