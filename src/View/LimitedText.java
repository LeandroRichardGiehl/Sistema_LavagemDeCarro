/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author richa
 */
public class LimitedText {
    public class TextoLimite extends PlainDocument {
  private int limit;
  
  public TextoLimite(int limit) {
    super();
    this.limit = limit;
  }

        /**
         *
         * @param offset
         * @param str
         * @param attr
         * @throws BadLocationException
         */
        @Override
  public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
    if (str == null)
      return;

    if ((getLength() + str.length()) <= limit) {
      super.insertString(offset, str, attr);
    }
  }
    }

}
