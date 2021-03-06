/* Copyright (c) 2008 Ben Howell
 * This software is licensed under the MIT License
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a 
 * copy of this software and associated documentation files (the "Software"), 
 * to deal in the Software without restriction, including without limitation 
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, 
 * and/or sell copies of the Software, and to permit persons to whom the 
 * Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in 
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE 
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING 
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER 
 * DEALINGS IN THE SOFTWARE.
 */

package com.digero.lotromusic.abc;

import com.digero.lotromusic.keyboard.Note;

public class NoteEvent {
	public long startMicros;
	public long endMicros;
	public Note note;

	public NoteEvent(long startMicros, Note note) {
		this.startMicros = startMicros;
		this.note = note;
	}

	public NoteEvent(long startMicros, Note note, long endMicros) {
		this.startMicros = startMicros;
		this.note = note;
		this.endMicros = endMicros;
	}

	public long getLength() {
		return endMicros - startMicros;
	}

	public void setLength(long length) {
		endMicros = startMicros + length;
	}
}