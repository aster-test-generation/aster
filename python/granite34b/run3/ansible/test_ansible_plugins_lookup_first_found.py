import unittest
from ansible.plugins.lookup.first_found import _split_on, LookupModule


class TestFirstFound(unittest.TestCase):
    def test_split_on(self):
        self.assertEqual(_split_on("a,b,c"), ["a", "b", "c"])
        self.assertEqual(_split_on(["a", "b", "c"]), ["a", "b", "c"])
        self.assertEqual(_split_on(["a,b", "c"]), ["a", "b", "c"])
        self.assertEqual(_split_on({"a": "b", "c": "d"}), ["a=b", "c=d"])

    def test_lookup_module(self):
        lookup = LookupModule()
        result = lookup.run(["file1.txt", "file2.txt"], {}, None)
        self.assertEqual(result, ["file1.txt"])

if __name__ == '__main__':
    unittest.main()