package interfaces

/**
 * Interface que define o comportamento de uma lista linear.
 */
interface List<E> {
    /**
     * Informa a quantidade de elementos armazenados na lista.
     * @return A quantidade de elementos armazenados na lista.
     */
    fun numElements(): Int

    /**
     * Informa se a lista está vazia.
     * @return Verdadeiro se a lista estiver vazia,
     *         falso caso contrário.
     */
    fun isEmpty(): Boolean

    /**
     * Informa se a lista está cheia.
     * @return Verdadeiro se a lista estiver cheia,
     *         falso caso contrário.
     */
    fun isFull(): Boolean

    /**
     * Insere um novo elemento na posição indicada.
     * @param element O elemento a ser inserido
     * @param pos A posição onde o elemento será inserido
     *            (iniciando em 0)
     */
    fun insert(element: E, pos: Int)

    /**
     * Remove o elemento da posição indicada.
     * @param pos A posição de onde o elemento será removido
     *            (iniciando em 0)
     * @return O elemento removido
     */
    fun remove(pos: Int): E

    /**
     * Retorna o elemento da posição indicada, sem removê-lo.
     * @param pos A posição do elemento
     * @return O elemento
     */
    fun get(pos: Int): E

    /**
     * Localiza a primeira ocorrência do elemento indicado na lista.
     * @param element O elemento a ser localizado
     * @return A posição da primeira ocorrência do elemento,
     *         ou -1 se ele não for encontrado.
     */
    fun search(element: E): Int
}
