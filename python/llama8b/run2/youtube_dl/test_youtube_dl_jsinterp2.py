import unittest
from youtube_dl.jsinterp import JSInterpreter

class TestJSInterpreter(unittest.TestCase):
    def test_init(self):
        interpreter = JSInterpreter("var x = 1; return x;")
        self.assertEqual(interpreter.interpret_statement("return x;", {}, 100), 1)

    def test_assign_operator(self):
        interpreter = JSInterpreter("var x = 1; x = x + 1; return x;")
        self.assertEqual(interpreter.interpret_statement("return x;", {}, 100), 2)

    def test_function_call(self):
        interpreter = JSInterpreter("function add(x, y) { return x + y; } return add(1, 2);")
        self.assertEqual(interpreter.interpret_statement("return add(1, 2);", {}, 100), 3)

    def test_object_access(self):
        interpreter = JSInterpreter("var obj = { a: 1, b: 2 }; return obj.a;")
        self.assertEqual(interpreter.interpret_statement("return obj.a;", {}, 100), 1)

    def test_array_access(self):
        interpreter = JSInterpreter("var arr = [1, 2, 3]; return arr[1];")
        self.assertEqual(interpreter.interpret_statement("return arr[1];", {}, 100), 2)

    def test_array_slice(self):
        interpreter = JSInterpreter("var arr = [1, 2, 3, 4, 5]; return arr.slice(1, 3);")
        self.assertEqual(interpreter.interpret_statement("return arr.slice(1, 3);", {}, 100), [2, 3])

    def test_array_splice(self):
        interpreter = JSInterpreter("var arr = [1, 2, 3, 4, 5]; return arr.splice(1, 2);")
        self.assertEqual(interpreter.interpret_statement("return arr.splice(1, 2);", {}, 100), [2, 3])

    def test_if_statement(self):
        interpreter = JSInterpreter("var x = 1; if (x > 0) return 1; else return 0;")
        self.assertEqual(interpreter.interpret_statement("return x > 0 ? 1 : 0;", {}, 100), 1)

    def test_while_loop(self):
        interpreter = JSInterpreter("var x = 0; while (x < 3) { x++; } return x;")
        self.assertEqual(interpreter.interpret_statement("return x;", {}, 100), 3)

    def test_for_loop(self):
        interpreter = JSInterpreter("var arr = [1, 2, 3]; var sum = 0; for (var i = 0; i < arr.length; i++) { sum += arr[i]; } return sum;")
        self.assertEqual(interpreter.interpret_statement("return sum;", {}, 100), 6)

    def test_recursive_function(self):
        interpreter = JSInterpreter("function factorial(n) { if (n <= 1) return 1; else return n * factorial(n - 1); } return factorial(5);")
        self.assertEqual(interpreter.interpret_statement("return factorial(5);", {}, 100), 120)

    def test_private_method(self):
        interpreter = JSInterpreter("function _private_method(x) { return x * 2; } return _private_method(2);")
        self.assertEqual(interpreter.interpret_statement("return _private_method(2);", {}, 100), 4)

    def test_protected_method(self):
        interpreter = JSInterpreter("_protected_method = function(x) { return x * 2; }; return _protected_method(2);")
        self.assertEqual(interpreter.interpret_statement("return _protected_method(2);", {}, 100), 4)

    def test_magic_method(self):
        interpreter = JSInterpreter("function __str__(self) { return 'Hello, World!'; }; return __str__(this);")
        self.assertEqual(interpreter.interpret_statement("return __str__(this);", {}, 100), "Hello, World!")

if __name__ == '__main__':
    unittest.main()