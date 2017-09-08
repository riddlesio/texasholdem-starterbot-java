/*
 *  Copyright 2017 riddles.io (developers@riddles.io)
 *
 *      Licensed under the Apache License, Version 2.0 (the "License");
 *      you may not use this file except in compliance with the License.
 *      You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *      Unless required by applicable law or agreed to in writing, software
 *      distributed under the License is distributed on an "AS IS" BASIS,
 *      WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *      See the License for the specific language governing permissions and
 *      limitations under the License.
 *
 *      For the full copyright and license information, please view the LICENSE
 *      file that was distributed with this source code.
 */

package table;

import java.util.HashMap;
import java.util.Map;

/**
 * table.BetRound - Created on 1-9-17
 *
 * All the different bet rounds
 *
 * @author Jim van Eeden - jim@riddles.io
 */
public enum BetRound {
    PREFLOP,
    FLOP,
    TURN,
    RIVER;

    private static final Map<String, BetRound> TYPE_MAP = new HashMap<>();

    static {
        for (BetRound moveType : values()) {
            TYPE_MAP.put(moveType.toString(), moveType);
        }
    }

    public static BetRound fromString(String string) {
        return TYPE_MAP.get(string.toLowerCase());
    }

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
