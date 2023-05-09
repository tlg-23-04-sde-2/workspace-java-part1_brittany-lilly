     //LAB02.2 DISPLAY TYPE --NOT VOLUME PRESETS DISPLAY TYPE!!
// This provides for exactly 5 instances of DisplayType -- NOT STRINGS
// e.g DisplayType.LED, DisplayType.OLED, etc. -- NO 'new' in Client for these
enum DisplayType {
    LED,
    OLED,
    PLASMA,
    LCD,
    CRT;
}