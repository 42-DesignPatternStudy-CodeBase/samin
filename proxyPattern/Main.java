package proxyPattern;

public class Main {
    public static void main(String[] args) {
        Printer originPrinter = new Printer("ft_printf");
        Printable p = new PrinterProxy("Alice");
        
        Printable p2 = new PrinterProxy(originPrinter);


        System.out.println("current printer name is" + p.getPrinterName());
        
        p.setPrinterName("Bob");
        System.out.println("current printer name is" + p.getPrinterName());
        
        p.print("Hello, world.");
        p.print("test");

        p.setPrinterName("Tomas");
        System.out.println("current printer name is" + p.getPrinterName());

        System.out.println("current printer name is" + p2.getPrinterName());
    
    }
}