import unittest
from ansible.module_utils._text import to_native


class TestMandatoryFunction(unittest.TestCase):
    def test_mandatory(self):
        self.assertEqual(mandatory('hello'), 'hello')
        with self.assertRaises(AnsibleFilterError):
            mandatory(None)

class TestCombineFunction(unittest.TestCase):
    def test_combine(self):
        self.assertEqual(combine({'a': 1}, {'b': 2}), {'a': 1, 'b': 2})
        self.assertEqual(combine({'a': 1}, {'a': 2}, recursive=True), {'a': 2})

class TestCommentFunction(unittest.TestCase):
    def test_comment(self):
        self.assertEqual(comment('hello'), ' # hello\n')
        self.assertEqual(comment('hello', style='plain', decoration='//'), '// hello\n')

class TestExtractFunction(unittest.TestCase):
    def test_extract(self):
        env = {'a': {'b': {'c': 'hello'}}}
        self.assertEqual(extract(env, 'a', env), {'b': {'c': 'hello'}})
        self.assertEqual(extract(env, 'a.b', env), 'hello')

class TestDoGroupByFunction(unittest.TestCase):
    def test_do_groupby(self):
        env = {'a': [{'b': 1, 'c': 2}, {'b': 1, 'c': 3}, {'b': 2, 'c': 4}]}
        self.assertEqual(do_groupby(env, env['a'], 'b'), [(1, [{'b': 1, 'c': 2}, {'b': 1, 'c': 3}]), (2, [{'b': 2, 'c': 4}])])

class TestB64EncodeFunction(unittest.TestCase):
    def test_b64encode(self):
        self.assertEqual(b64encode('hello'), 'aGVsbG8=')

class TestB64DecodeFunction(unittest.TestCase):
    def test_b64decode(self):
        self.assertEqual(b64decode('aGVsbG8='), 'hello')

class TestFlattenFunction(unittest.TestCase):
    def test_flatten(self):
        self.assertEqual(flatten([1, 2, 3]), [1, 2, 3])
        self.assertEqual(flatten([[1, 2], 3]), [1, 2, 3])

class TestSubelementsFunction(unittest.TestCase):
    def test_subelements(self):
        obj = {'a': {'b': 1, 'c': 2}, 'd': {'b': 3, 'c': 4}}
        self.assertEqual(subelements(obj, 'a.b'), [({'a': {'b': 1, 'c': 2}}, 1)])
        self.assertEqual(subelements(obj, 'a.c'), [({'a': {'b': 1, 'c': 2}}, 2)])

if __name__ == '__main__':
    unittest.main()