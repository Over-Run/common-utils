/*
 * MIT License
 *
 * Copyright (c) 2021 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package org.overrun.commonutils;

/**
 * @author squid233
 * @since 0.1.0
 */
public class Math {
    private static final float EPSINON = 0.00001f;

    /**
     * Check that {@code i} is pow of 2.
     *
     * @param i Value for checking
     * @return is 2<sup>n</sup> == {@code i}
     */
    public static boolean isPowOf2(int i) {
        return (i & (i - 1)) == 0;
    }

    /**
     * Check that {@code i} is not pow of 2.
     *
     * @param i Value for checking
     * @return is 2<sup>n</sup> != {@code i}
     */
    public static boolean isNotPowOf2(int i) {
        return (i & (i - 1)) != 0;
    }

    /**
     * Check that {@code f} is 0.
     *
     * @param f Value for checking
     * @return is {@code f} == 0
     */
    public static boolean isZero(float f) {
        return (f >= - EPSINON) && (f <= EPSINON);
    }

    /**
     * Check that {@code f} is not 0.
     *
     * @param f Value for checking
     * @return is {@code f} != 0
     */
    public static boolean isNotZero(float f) {
        return f < -EPSINON || f > EPSINON;
    }
}
