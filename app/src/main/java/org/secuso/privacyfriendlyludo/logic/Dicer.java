package org.secuso.privacyfriendlyludo.logic;

import java.security.SecureRandom;

/*
  @author: Julia Schneider

  This file is part of the Game Ludo.

 Ludo is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 You should have received a copy of the GNU General Public License
 along with Ludo.  If not, see <http://www.gnu.org/licenses/>.
 */

class Dicer {


    int rollDice(boolean mydice)
    {
       int dice;
        SecureRandom random = new SecureRandom();
        byte bytes[] = new byte[6];
        random.nextBytes(bytes);

       /*  if (mydice)
        {
            dice = 3;
        }
        else
        {
            dice=4;
        } */


        dice = random.nextInt(6) +1;

        return dice;
    }

}
