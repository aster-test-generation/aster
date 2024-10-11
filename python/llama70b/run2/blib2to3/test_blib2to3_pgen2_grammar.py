import unittest
from blib2to3.pgen2.grammar import Grammar, opmap


class TestGrammar(unittest.TestCase):
    def test_init(self):
        instance = Grammar()
        self.assertIsInstance(instance, Grammar)

    def test_dump(self):
        instance = Grammar()
        with tempfile.NamedTemporaryFile() as f:
            instance.dump(f.name)
            self.assertTrue(os.path.exists(f.name))

    def test_update(self):
        instance = Grammar()
        attrs = {"symbol2number": {"a": 1}, "number2symbol": {1: "a"}}
        instance._update(attrs)
        self.assertEqual(instance.symbol2number, {"a": 1})
        self.assertEqual(instance.number2symbol, {1: "a"})

    def test_load(self):
        instance = Grammar()
        with tempfile.NamedTemporaryFile() as f:
            instance.dump(f.name)
            instance.load(f.name)
            self.assertEqual(instance.symbol2number, {})
            self.assertEqual(instance.number2symbol, {})

    def test_loads(self):
        instance = Grammar()
        pkl = pickle.dumps(instance.__dict__)
        instance.loads(pkl)
        self.assertEqual(instance.symbol2number, {})
        self.assertEqual(instance.number2symbol, {})

    def test_copy(self):
        instance = Grammar()
        instance.symbol2number = {"a": 1}
        instance.number2symbol = {1: "a"}
        new_instance = instance.copy()
        self.assertIsNot(instance, new_instance)
        self.assertEqual(new_instance.symbol2number, {"a": 1})
        self.assertEqual(new_instance.number2symbol, {1: "a"})

    def test_report(self):
        instance = Grammar()
        instance.symbol2number = {"a": 1}
        instance.number2symbol = {1: "a"}
        instance.report()
        # This test is a bit tricky, as report() prints to stdout
        # We can't easily assert the output, but we can test that it doesn't raise an exception

    def test_private_method__getstate__(self):
        instance = Grammar()
        result = instance._Grammar__getstate__()
        self.assertIsInstance(result, dict)

    def test_magic_method__str__(self):
        instance = Grammar()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_magic_method__repr__(self):
        instance = Grammar()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_magic_method__eq__(self):
        instance1 = Grammar()
        instance2 = Grammar()
        self.assertTrue(instance1 == instance2)

class TestOpmap(unittest.TestCase):
    def test_opmap(self):
        self.assertIsInstance(opmap, dict)
        self.assertGreater(len(opmap), 0)

if __name__ == '__main__':
    unittest.main()