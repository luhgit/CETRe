/* Copyright [2014] [Xinyue Wang]
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

package crawler.util.analyzer;

import java.io.Reader;

//import org.apache.lucene.analysis.CharTokenizer;
import org.apache.lucene.analysis.LetterTokenizer;
import org.apache.lucene.util.Version;

public class TwitterLetterDigitTokenizer extends LetterTokenizer{
	
	public TwitterLetterDigitTokenizer(Version matchVersion, Reader in) {
		super(matchVersion, in);
	}

	protected boolean  isTokenChar(int c) {
		if ((c==(int)'@')||(c==(int)'#')||(c==(int)'/')||(c==(int)':')||(c==(int)'.'))
			return true;
		else return Character.isLetterOrDigit(c);
	}

	
}
