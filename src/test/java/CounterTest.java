import static org.junit.Assert.*;
import org.junit.Test;

public class CounterTest {

    @Test
    public void testKubus() {
        Kubus kubus = new Kubus(5, "Kubus Contoh");
        assertEquals(150.0, kubus.hitungLuasPermukaan(), 0.01);
        assertEquals(125.0, kubus.hitungVolume(), 0.01);
    }

    @Test
    public void testLingkaran() {
        Lingkaran lingkaran = new Lingkaran(7, "Lingkaran Contoh");
        assertEquals(43.96, lingkaran.hitungKeliling(), 0.01); // 2 * 3.14 * 7
        assertEquals(153.86, lingkaran.hitungLuas(), 0.01);   // 3.14 * 7 * 7
    }

    @Test
    public void testPersegiPanjang() {
        PersegiPanjang persegiPanjang = new PersegiPanjang(10, 5, "Persegi Panjang Contoh");
        assertEquals(30.0, persegiPanjang.hitungKeliling(), 0.01); // 2 * (10 + 5)
        assertEquals(50.0, persegiPanjang.hitungLuas(), 0.01);     // 10 * 5
    }

    @Test
    public void testPrismaSegi3() {
        PrismaSegi3 prismaSegi3 = new PrismaSegi3(3, 4, 10, "Prisma Segitiga Contoh");
        assertEquals(162.0, prismaSegi3.hitungLuasPermukaan(), 0.01); 
        assertEquals(60.0, prismaSegi3.hitungVolume(), 0.01);      
    }

}
