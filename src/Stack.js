/**
 * Created by doramedgyasszay on 2017. 05. 04..
 */

var Stack = function () {
  this.top = null;
  this.size = 0;
};

var Node = function (data) {
    this.data = data;
    this.next = null;
    this.prev = null;
};

Stack.prototype.push = function (data) {
    var node = new Node(data);
    if (this.top === null) {
        this.top = node;
    } else {
        node.prev = this.top;
        this.top.next = node;
        this.top = node;

    }
    this.size++;
};

Stack.prototype.pop = function () {
  if (this.top === null){
      return null;
  } else {
      var out = this.top;
      this.top = this.top.prev;
      if (this.top != null){
          this.top.next = null;
      }
      this.size--;
      return out;
  }
};
Stack.prototype.displayAll = function () {
  if(this.top === null){
      return null;
  } else {
      var array = new Array();
      var length = this.size;
      var current = this.top;
      for (var i=0; i< length; i++){
          array[i] = current.data;
          current = current.prev;
      }
      return array;
  }
};

var stack = new Stack();
stack.push(12);
stack.push(45);
stack.push(1);
stack.push(66);
console.log("Top element now: " + stack.top.data);
console.log("Size of the Stack now: " + stack.size);
stack.pop();
console.log("Top element now: " + stack.top.data);
console.log("Size of the Stack now: " + stack.size);
console.log("Display: " + stack.displayAll());