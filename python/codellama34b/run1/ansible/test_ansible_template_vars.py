import unittest
from ansible.template import *


class TestAnsibleJ2Vars(unittest.TestCase):
    def test_init(self):
        templar = Templar()
        globals = dict()
        locals = dict()
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertIsInstance(instance, AnsibleJ2Vars)

    def test_contains(self):
        templar = Templar()
        globals = dict()
        locals = dict()
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertFalse(instance.__contains__('k'))

    def test_iter(self):
        templar = Templar()
        globals = dict()
        locals = dict()
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertIsInstance(instance.__iter__(), AnsibleJ2Vars)

    def test_len(self):
        templar = Templar()
        globals = dict()
        locals = dict()
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(instance.__len__(), 0)

    def test_getitem(self):
        templar = Templar()
        globals = dict()
        locals = dict()
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertRaises(KeyError, instance.__getitem__, 'varname')

    def test_add_locals(self):
        templar = Templar()
        globals = dict()
        locals = dict()
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertIsInstance(instance.add_locals(locals), AnsibleJ2Vars)

if __name__ == '__main__':
    unittest.main()