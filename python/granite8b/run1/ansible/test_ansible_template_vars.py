import unittest
from ansible.template.vars import AnsibleJ2Vars


class TestAnsibleJ2Vars(unittest.TestCase):
    def test_contains(self):
        templar = object()
        globals = {'a': 1, 'b': 2}
        locals = {'c': 3, 'd': 4}
        j2vars = AnsibleJ2Vars(templar, globals, locals)
        self.assertTrue('a' in j2vars)
        self.assertTrue('b' in j2vars)
        self.assertTrue('c' in j2vars)
        self.assertTrue('d' in j2vars)
        self.assertFalse('e' in j2vars)

    def test_iter(self):
        templar = object()
        globals = {'a': 1, 'b': 2}
        locals = {'c': 3, 'd': 4}
        j2vars = AnsibleJ2Vars(templar, globals, locals)
        keys = set(j2vars)
        self.assertEqual(keys, {'a', 'b', 'c', 'd'})

    def test_len(self):
        templar = object()
        globals = {'a': 1, 'b': 2}
        locals = {'c': 3, 'd': 4}
        j2vars = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(len(j2vars), 4)

    def test_getitem(self):
        templar = object()
        globals = {'a': 1, 'b': 2}
        locals = {'c': 3, 'd': 4}
        j2vars = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(j2vars['a'], 1)
        self.assertEqual(j2vars['b'], 2)
        self.assertEqual(j2vars['c'], 3)
        self.assertEqual(j2vars['d'], 4)
        with self.assertRaises(KeyError):
            j2vars['e']

    def test_add_locals(self):
        templar = object()
        globals = {'a': 1, 'b': 2}
        locals = {'c': 3, 'd': 4}
        j2vars = AnsibleJ2Vars(templar, globals, locals)
        new_locals = {'e': 5, 'f': 6}
        new_j2vars = j2vars.add_locals(new_locals)
        self.assertEqual(new_j2vars['a'], 1)
        self.assertEqual(new_j2vars['b'], 2)
        self.assertEqual(new_j2vars['c'], 3)
        self.assertEqual(new_j2vars['d'], 4)
        self.assertEqual(new_j2vars['e'], 5)
        self.assertEqual(new_j2vars['f'], 6)

if __name__ == '__main__':
    unittest.main()