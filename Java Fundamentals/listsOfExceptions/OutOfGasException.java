import java.util.Random;
class OutOfGasException extends Exception{}
class UnreliableFriend {
    public boolean deliverMessage() throws OutOfGasException{
        final Random r = new Random();
        final boolean hasGas = r.nextBoolean();
        if (hasGas) {
            return true;
        }
        throw new OutOfGasException();
    }
    public static void main(final String[] args) {

    }

    
}

class DeliverMessage {
    public static void main(final String[] args) {
        final UnreliableFriend friend = new UnreliableFriend();
        try {
            friend.deliverMessage();
            System.out.println("The message was delivered!");
        } catch (final OutOfGasException e) {
            System.out.println("Hey, uh, so, I ran out of gas..");
            // back-up plan here.
        }
    }
}
