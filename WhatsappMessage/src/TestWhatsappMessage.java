/**
 * This file is a part of WhatsappMessage project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class TestWhatsappMessage {
    public static void main(String[] args) {
        WhatsappMessage message = new WhatsappMessage(
                "Hi, Sara, I was thinking about going for coffee...Care to join me?", "David", "Sara", 1,
                1570440000000L);

        System.out.println(message);
    }
}
