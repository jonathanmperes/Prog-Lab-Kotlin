package classes

import exceptions.OverflowException
import exceptions.UnderflowException
import interfaces.List

class StaticList<E>(private val maxSize: Int) : List<E> {

    private val elements: Array<Any?>
    private var numElements: Int

    init {
        elements = arrayOfNulls(maxSize)
        numElements = 0
    }

    override fun numElements(): Int = numElements

    override fun isEmpty(): Boolean = numElements == 0

    override fun isFull(): Boolean = numElements == elements.size

    override fun insert(element: E, pos: Int) {
        if (isFull())
            throw OverflowException()

        if (pos < 0 || pos > numElements)
            throw IndexOutOfBoundsException()

        for (i in numElements -1 downTo pos)
            elements[i+1] = elements[i]

        elements[pos] = element
        numElements++
    }

    override fun remove(pos: Int): E {
        if (isEmpty())
            throw UnderflowException()

        if (pos < 0 || pos >= numElements)
            throw IndexOutOfBoundsException()

        val element = elements[pos] as E

        for (i in pos until numElements -1)
            elements[i] = elements[i + 1]
        elements[numElements - 1] = null
        return element
    }

    override fun get(pos: Int): E {
        if (pos < 0 || pos >= numElements)
            throw IndexOutOfBoundsException()

        return elements[pos] as E
    }

    override fun search(element: E): Int {
        for (i in 0 until numElements)
            if (element == elements[i])
                return 1
        return -1
    }

    override fun toString(): String {
        var s = ""
        for (i in 0 until numElements)
            s += elements[i].toString() + " "
        return s
    }
}