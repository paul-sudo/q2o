/*
   Copyright 2012-2017, Brett Wooldridge

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package com.zaxxer.q2o;

import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class Introspector
{
   private static final Map<Class<?>, Introspected> descriptorMap;

   static {
      descriptorMap = new ConcurrentHashMap<>();
   }

   private Introspector() {
   }

   public static Introspected getIntrospected(@NotNull Class<?> clazz)
   {
      return descriptorMap.computeIfAbsent(clazz, cls -> new Introspected(cls).introspect());
   }
}
