/**
 * Created by doramedgyasszay on 2017. 05. 04..
 */

var Queue = function () {
  this.head = null;
  this.tail = null;
  this.size = 0;
};

var Node = function (data) {
  this.data = data;
  this.prev = null;
  this.next = null;
};

Queue.prototype.enqueue = function (data) {
    var node = new Node(data);
    if(this.head === null){
        this.head = this.tail = node;
    } else {
        this.tail.next = node;
        this.tail = node;
    }
    this.size++;
};

Queue.prototype.dequeue = function () {
  if (this.head === null){
      return null;
  } else {
      var out = this.head;
      this.head = this.head.next;
      this.size--;
      return out;
  }

};

Queue.prototype.displayAll = function () {
    if(this.tail === null){
        return null;
    } else {
        var array = new Array();
        var arrLength = this.size;
        var current = this.head;
        for (var i = 0; i < arrLength; i++){
            array[i] = current.data;
            current = current.next;
        }
        return array;
    }
};

var q = new Queue();
q.enqueue(12);
q.enqueue(6);
q.enqueue(89);
q.enqueue(3);
console.log("First element: " + q.head.data);
console.log("Last element: " + q.tail.data);
q.dequeue();
console.log("First element: " + q.head.data);
console.log("Display all: " + q.displayAll());