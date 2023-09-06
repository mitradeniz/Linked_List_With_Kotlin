class Node(data: Int){
    var dataL = data
    var next: Node? = null
}

class LinkedList {
    var head: Node? = null

    fun append(data: Int) {
        val newNode = Node(data)
        if (head == null) {
            head = newNode
        } else {
            var current = head
            while (current?.next != null) {
                current = current.next
            }
            current?.next = newNode
        }
    }

    fun deleteData(data: Int) {
        var current = head
        var previous: Node? = null

        if (current == null) {
            return
        }

        if (current.dataL == data) {
            head = current.next
            return
        }

        while (current != null && current.dataL != data) {
            previous = current
            current = current.next

        }

        if (current != null) {
            previous?.next = current.next
        }


    }

    fun printList() {
        var current = head
        while (current != null) {
            println("${current.dataL}")
            current = current.next
        }
        println()
    }
}

fun main(args: Array<String>) {
    val linkedList = LinkedList()

    linkedList.append(5)
    linkedList.append(15)
    linkedList.append(56)
    linkedList.append(534)
    linkedList.append(52)
    linkedList.append(123)
    linkedList.append(555)

    var head = linkedList.head
    println("head = ${head?.dataL}")

    linkedList.printList()

    linkedList.deleteData(534)
    linkedList.deleteData(123)
    linkedList.deleteData(555)

    linkedList.printList()

    println("head = ${linkedList.head?.dataL}")

    linkedList.deleteData(5)
    println("-----\ndeleted head\n-----\nhead = ${linkedList.head?.dataL}")

    println()
    linkedList.printList()
}