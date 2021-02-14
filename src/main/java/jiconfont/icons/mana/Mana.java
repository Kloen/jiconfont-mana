package jiconfont.icons.mana;

import jiconfont.IconCode;
import jiconfont.IconFont;

import java.io.InputStream;

/**
 * Copyright (c) 2018 KloenLansfiel <BR>
 * <BR>
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:<BR>
 * <BR>
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.<BR>
 * <BR>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
public enum Mana implements IconCode {

    /**
     * Mana & Resource Symbols
     */
    W( '\uE600'),
    U( '\uE601'),
    B( '\uE602'),
    R( '\uE603'),
    G( '\uE604'),
    C( '\uE904'),
    P( '\uE618'),
    S( '\uE619'),
    X( '\uE615'),
    Y( '\uE616'),
    Z( '\uE617'),
    _0( '\uE605'),
    _1( '\uE606'),
    _2( '\uE607'),
    _3( '\uE608'),
    _4( '\uE609'),
    _5( '\uE60A'),
    _6( '\uE60B'),
    _7( '\uE60C'),
    _8( '\uE60D'),
    _9( '\uE60E'),
    _10( '\uE60F'),
    _11( '\uE610'),
    _12( '\uE611'),
    _13( '\uE612'),
    _14( '\uE613'),
    _15( '\uE614'),
    _16( '\uE62A'),
    _17( '\uE62B'),
    _18( '\uE62C'),
    _19( '\uE62D'),
    _20( '\uE62E'),
    HALF( '\uE902'),
    INFINITY( '\uE903'),
    _100( '\uE900'),
    _1000000( '\uE901'),
    E('\uE907'),

    /**
     * Card Symbols
     */
    TAP( '\uE61A'),
    UNTAP( '\uE61B'),
    TAP_ALT( '\uE61C'),
    CHAOS( '\uE61D'),
    FLASHBACK( '\uE629'),
    LOYALTY_UP( '\uE627'),
    LOYALTY_DOWN( '\uE625'),
    LOYALTY_ZERO( '\uE626'),
    LOYALTY_START( '\uE628'),
    POWER( '\uE921'),
    TOUGHNESS( '\uE922'),
    ARTIST_BRUSH( '\uE923'),
    ARTIST_NIB( '\uE924'),
    SAGA('\uE92A'),
    ACORN('\uE929'),
    RARITY('\uE96C'),
    MULTICOLOR('\uE986'),

    /**
     * Double-Faced Cards
     */
    DFC_DAY( '\uE906'),
    DFC_NIGHT( '\uE905'),
    DFC_SPARK( '\uE909'),
    DFC_IGNITE( '\uE908'),
    DFC_MOON( '\uE90B'),
    DFC_EMRAKUL( '\uE90A'),
    DFC_ENCHANTMENT( '\uE920'),
    DFC_MODAL_FACE('\uE983'),
    DFC_MODAL_BLACK('\uE984'),

    /**
     * Card Types
     */
    ARTIFACT( '\uE61E'),
    CREATURE( '\uE61F'),
    ENCHANTMENT( '\uE620'),
    INSTANT( '\uE621'),
    LAND( '\uE622'),
    PLANESWALKER( '\uE623'),
    SORCERY( '\uE624'),
    TRIBAL( '\uE925'),
    MULTIPLE( '\uE925'),
    PLANE('\uE96F'),
    PHENOMENON('\uE96E'),
    SCHEME('\uE970'),
    CONSPIRACY('\uE972'),
    VANGUARD('\uE971'),
    TOKEN('\uE96D'),

    /**
     * Guild and Clan Watermarks
     */
    GUILD_AZORIUS( '\uE90C'),
    GUILD_BOROS( '\uE90D'),
    GUILD_DIMIR( '\uE90E'),
    GUILD_GOLGARI( '\uE90F'),
    GUILD_GRUUL( '\uE910'),
    GUILD_IZZET( '\uE911'),
    GUILD_ORZHOV( '\uE912'),
    GUILD_RAKDOS( '\uE913'),
    GUILD_SELESNYA( '\uE914'),
    GUILD_SIMIC( '\uE915'),
    CLAN_ABZAN( '\uE916'),
    CLAN_JESKAI( '\uE917'),
    CLAN_MARDU( '\uE918'),
    CLAN_SULTAI( '\uE919'),
    CLAN_TEMUR( '\uE91A'),
    CLAN_ATARKA( '\uE91B'),
    CLAN_DROMOKA( '\uE91C'),
    CLAN_KOLAGHAN( '\uE91D'),
    CLAN_OJUTAI( '\uE91E'),
    CLAN_SILUMGAR( '\uE91F'),

    /**
     * Poleis Symbols
     */
    POLIS_SETESSA( '\uE926'),
    POLIS_AKROS( '\uE927'),
    POLIS_MELETIS( '\uE928');

    private final char character;

    Mana(char character) {
        this.character = character;
    }

    @Override
    public char getUnicode() {
        return character;
    }

    @Override
    public String getFontFamily() {
        return "Mana";
    }

    public static IconFont getIconFont() {
        return new IconFont() {
            @Override
            public String getFontFamily() {
                return "Mana";
            }

            @Override
            public InputStream getFontInputStream() {
                return Mana.class.getResourceAsStream("/fonts/mana.ttf");
            }
        };
    }
}
