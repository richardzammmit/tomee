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
package org.apache.openejb.util;

import java.io.PrintWriter;

/**
 * @version $Rev: 1153797 $ $Date: 2011-08-04 11:09:44 +0200 (jeu. 04 août 2011) $
 */
public class LoggingPrintWriter extends PrintWriter {
    private final StringBuffer text = new StringBuffer("");
    private final Logger logger;

    public LoggingPrintWriter(final String category) {
        super(System.err);
        logger = Logger.getInstance(LogCategory.OPENEJB.createChild(category), LoggingPrintWriter.class.getName());
    }

    public void close() {
        flush();
    }

    private void flushLine() {
        logger.info(text.toString());
        text.setLength(0);
    }

    public void flush() {
        if (!text.toString().equals("")) {
            flushLine();
        }
    }

    public void print(final boolean b) {
        text.append(b);
    }

    public void print(final char c) {
        text.append(c);
    }

    public void print(final char[] s) {
        text.append(s);
    }

    public void print(final double d) {
        text.append(d);
    }

    public void print(final float f) {
        text.append(f);
    }

    public void print(final int i) {
        text.append(i);
    }

    public void print(final long l) {
        text.append(l);
    }

    public void print(final Object obj) {
        text.append(obj);
    }

    public void print(final String s) {
        text.append(s);
    }

    public void println() {
        if (!text.toString().equals("")) {
            flushLine();
        }
    }

    public void println(final boolean x) {
        text.append(x);
        flushLine();
    }

    public void println(final char x) {
        text.append(x);
        flushLine();
    }

    public void println(final char[] x) {
        text.append(x);
        flushLine();
    }

    public void println(final double x) {
        text.append(x);
        flushLine();
    }

    public void println(final float x) {
        text.append(x);
        flushLine();
    }

    public void println(final int x) {
        text.append(x);
        flushLine();
    }

    public void println(final long x) {
        text.append(x);
        flushLine();
    }

    public void println(final Object x) {
        text.append(x);
        flushLine();
    }

    public void println(final String x) {
        text.append(x);
        flushLine();
    }
}
