package iso2ControlManager.sql.entity;

public class Configuration {
    private int id;
    private int timeShiftSpinner;
    private byte[] backroundColor;
    private byte[] dateTimeColor;
    private byte[] textColor;
    private byte[] textFont;
    private byte[] dateFont;
    private byte[] timeFont;
    private byte[] timeZoneBox;
    private String timeFormatBox;
    private String dateFormatBox;
    private String fourthLineFormatBox;
    private String oneLineField;
    private int pc_id;


    //-------------------------------------------------------------------------------------------------------
    public Configuration() {

    }

    //-------------------------------------------------------------------------------------------------------
    public Configuration(int timeShiftSpinner, byte[] backroundColor, byte[] dateTimeColor, byte[] textColor,
                         byte[] textFont, byte[] dateFont, byte[] timeFont, byte[] timeZoneBox, String timeFormatBox,
                         String dateFormatBox, String fourthLineFormatBox, String oneLineField, int pc_id) {
        this.timeShiftSpinner = timeShiftSpinner;
        this.backroundColor = backroundColor;
        this.dateTimeColor = dateTimeColor;
        this.textColor = textColor;
        this.textFont = textFont;
        this.dateFont = dateFont;
        this.timeFont = timeFont;
        this.timeZoneBox = timeZoneBox;
        this.timeFormatBox = timeFormatBox;
        this.dateFormatBox = dateFormatBox;
        this.fourthLineFormatBox = fourthLineFormatBox;
        this.oneLineField = oneLineField;
        this.pc_id = pc_id;
    }

    //-------------------------------------------------------------------------------------------------------
    public Configuration(int id, int timeShiftSpinner, byte[] backroundColor, byte[] dateTimeColor, byte[] textColor,
                         byte[] textFont, byte[] dateFont, byte[] timeFont, byte[] timeZoneBox, String timeFormatBox, String dateFormatBox,
                         String fourthLineFormatBox, String oneLineField, int pc_id) {
        this.id = id;
        this.timeShiftSpinner = timeShiftSpinner;
        this.backroundColor = backroundColor;
        this.dateTimeColor = dateTimeColor;
        this.textColor = textColor;
        this.textFont = textFont;
        this.dateFont = dateFont;
        this.timeFont = timeFont;
        this.timeZoneBox = timeZoneBox;
        this.timeFormatBox = timeFormatBox;
        this.dateFormatBox = dateFormatBox;
        this.fourthLineFormatBox = fourthLineFormatBox;
        this.oneLineField = oneLineField;
        this.pc_id = pc_id;
    }

    //-----------------------Getter and Setter-----------------------------------------------------------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTimeShiftSpinner() {
        return timeShiftSpinner;
    }

    public void setTimeShiftSpinner(int timeShiftSpinner) {
        this.timeShiftSpinner = timeShiftSpinner;
    }

    public byte[] getBackroundColor() {
        return backroundColor;
    }

    public void setBackroundColor(byte[] backroundColor) {
        this.backroundColor = backroundColor;
    }

    public byte[] getDateTimeColor() {
        return dateTimeColor;
    }

    public void setDateTimeColor(byte[] dateTimeColor) {
        this.dateTimeColor = dateTimeColor;
    }

    public byte[] getTextColor() {
        return textColor;
    }

    public void setTextColor(byte[] textColor) {
        this.textColor = textColor;
    }

    public byte[] getTextFont() {
        return textFont;
    }

    public void setTextFont(byte[] textFont) {
        this.textFont = textFont;
    }

    public byte[] getDateFont() {
        return dateFont;
    }

    public void setDateFont(byte[] dateFont) {
        this.dateFont = dateFont;
    }

    public byte[] getTimeFont() {
        return timeFont;
    }

    public void setTimeFont(byte[] timeFont) {
        this.timeFont = timeFont;
    }

    public String getTimeFormatBox() {
        return timeFormatBox;
    }

    public void setTimeFormatBox(String timeFormatBox) {
        this.timeFormatBox = timeFormatBox;
    }

    public String getDateFormatBox() {
        return dateFormatBox;
    }

    public void setDateFormatBox(String dateFormatBox) {
        this.dateFormatBox = dateFormatBox;
    }

    public String getFourthLineFormatBox() {
        return fourthLineFormatBox;
    }

    public void setFourthLineFormatBox(String fourthLineFormatBox) {
        this.fourthLineFormatBox = fourthLineFormatBox;
    }

    public String getOneLineField() {
        return oneLineField;
    }

    public void setOneLineField(String oneLineField) {
        this.oneLineField = oneLineField;
    }

    public int getPc_id() {
        return pc_id;
    }

    public void setPc_id(int pc_id) {
        this.pc_id = pc_id;
    }

    public byte[] getTimeZoneBox() {
        return timeZoneBox;
    }

    public void setTimeZoneBox(byte[] timeZoneBox) {
        this.timeZoneBox = timeZoneBox;
    }
}
