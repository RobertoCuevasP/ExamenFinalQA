package selenium.pomPages.todoLy;

import org.openqa.selenium.By;
import selenium.controls.Button;
import selenium.controls.Label;
import selenium.controls.TextBox;

public class CenterSection {
    //PROYECTO
    public Label projectNameLabel= new Label(By.xpath("//div[@id='CurrentProjectTitle']"));

    //---ITEM
    //opcion 1.- public TextBox insertNameItem = new TextBox(By.xpath("//table[@class='AddItemTable']//textarea[@id='NewItemContentInput']"));
    public TextBox insertNameItem = new TextBox(By.xpath("//textarea[@id='NewItemContentInput']"));
    public Button addItem = new Button(By.xpath("//table[@class='AddItemTable']//input[@id='NewItemAddButton']"));

    public Button selectItem = new Button(By.xpath("//li[last()]//div[@class='ItemContentDiv']"));
    public TextBox editItem = new TextBox(By.xpath("//li[last()]//div[@id='ItemEditDiv']//textarea"));
    //public Button saveItem = new Button(By.xpath("//li[last()]//div[@id='ItemEditDiv']//img"));


    ///delete sirve
    //alguno en especifico por id
    //public Button selectItemDelete = new Button(By.xpath("//div[@id='ItemId_10845215']"));
    public Button selectItemDelete = new Button(By.xpath(" //li[last()]//div[@class='ItemIndicator']//img[@style='display: inline;']"));
    public Button delete = new Button(By.xpath("//ul[@id='itemContextMenu']//a[@href='#delete']"));


    //TODOIST
    public Button abrir = new Button(By.xpath("//body[@class='theme-todoist']//a[@class='tdo-button js-cta js-cta-finish']"));



    public Button setting = new Button(By.xpath("//div[@id='ctl00_HeaderTopControl1_PanelHeaderButtons']//a[@href='javascript:OpenSettingsDialog();']"));
    public TextBox editName = new TextBox(By.xpath("//div[@id='settings_Profile']//input"));
    public Button ok = new Button(By.xpath("//div[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']//span"));


    public TextBox editOldPass = new TextBox(By.xpath("//div[@id='settings_Profile']//input[@id='TextPwOld']"));
    public TextBox editNewPass = new TextBox(By.xpath("//div[@id='settings_Profile']//input[@id='TextPwNew']"));



    public CenterSection(){}
}
