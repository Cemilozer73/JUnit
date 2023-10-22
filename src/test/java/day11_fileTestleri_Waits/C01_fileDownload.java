package day11_fileTestleri_Waits;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C01_fileDownload extends TestBase {

    @Test
    public void indirmeTesti(){
        // /Users/newlife/Desktop
        //2. https://the-internet.herokuapp.com/download adresine gidelim.
        driver.get("https://the-internet.herokuapp.com/download");
        //3. some-file.txt dosyasını indirelim
        bekle(1);
        driver.findElement(By.xpath("//a[text()='some-file.txt']")).click();
        bekle(3);
        //4. Dosyanın başarıyla indirilip indirilmediğini test edelim
        bekle(5);
        String dosyaYolu ="/Users/newlife/Downloads/some-file.txt";

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }




}
