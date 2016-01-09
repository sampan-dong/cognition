/*
 * Licensed to Booz Allen Hamilton under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Booz Allen Hamilton licenses this file to you
 * under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
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

package com.boozallen.cognition.ingest.storm.topology;

import org.apache.commons.configuration.Configuration;

import static com.boozallen.cognition.ingest.storm.topology.ConfigurableIngestTopologyConstants.*;

/**
 * @author bentse
 */
public class StormParallelismConfig {
  private final int parallelismHint;
  private final int numTasks;

  StormParallelismConfig(Configuration conf) {
    this.parallelismHint = conf.getInt(PARALLELISM_HINT, PARALLELISM_HINT_DEFAULT);
    this.numTasks = conf.getInt(NUM_TASKS, parallelismHint);
  }

  public int getParallelismHint() {
    return parallelismHint;
  }

  public int getNumTasks() {
    return numTasks;
  }
}