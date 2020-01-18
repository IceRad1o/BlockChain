public class TxHandler {

    private UXTOPool utxoPool;

    /**
     * Creates a public ledger whose current UTXOPool (collection of unspent transaction outputs) is
     * {@code utxoPool}. This should make a copy of utxoPool by using the UTXOPool(UTXOPool uPool)
     * constructor.
     */
    public TxHandler(UTXOPool utxoPool) {
        // IMPLEMENT THIS
        utxoPool = UXTOPool(utxoPool);
    }

    /**
     * @return true if:
     * (1) all outputs claimed by {@code tx} are in the current UTXO pool,
     * (2) the signatures on each input of {@code tx} are valid,
     * (3) no UTXO is claimed multiple times by {@code tx},
     * (4) all of {@code tx}s output values are non-negative, and
     * (5) the sum of {@code tx}s input values is greater than or equal to the sum of its output
     * values; and false otherwise.
     */
    public boolean isValidTx(Transaction tx) {
        // IMPLEMENT THIS
        ArrayList<Output> outputs = tx.outputs;
        ArrayList<Input> inputs = tx.inputs;
        ArrayList<UTXO> allutxo = utxoPool.getAllUTXO();
        ArrayList<Output> utxoOP = new ArrayList<Output>();

        for (Input in : inputs) {
            in.o
            if (verifySignature(in.signature) != true)
                return false;
        }

        for (UTXO utxo : allutxo) {
            utxoOP.add(getTxOutput(utxo))
        }

        double outputsum = 0.0;
        for (Output op : outputs) {
            if (utxoOP.contains(op) == false) {
                return false;
            }
            if (op.value < 0) {
                return false;
            }
            outputsum += op.value;
        }
        return true;

    }

    /**
     * Handles each epoch by receiving an unordered array of proposed transactions, checking each
     * transaction for correctness, returning a mutually valid array of accepted transactions, and
     * updating the current UTXO pool as appropriate.
     */
    public Transaction[] handleTxs(Transaction[] possibleTxs) {
        // IMPLEMENT THIS
        Transaction[] handleTxs = new Transaction();

    }

}
