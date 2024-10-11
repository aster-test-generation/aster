import unittest
from ansible.template.vars import *


class TestAnsibleJ2Vars(unittest.TestCase):
    def test_init(self):
        templar = Templar()
        globals = {}
        locals = {}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(instance._templar, templar)
        self.assertEqual(instance._globals, globals)
        self.assertEqual(instance._locals, locals)

    def test_contains(self):
        templar = Templar()
        globals = {}
        locals = {}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertFalse(instance.__contains__('k'))

    def test_iter(self):
        templar = Templar()
        globals = {}
        locals = {}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(instance.__iter__(), iter([]))

    def test_len(self):
        templar = Templar()
        globals = {}
        locals = {}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(instance.__len__(), 0)

    def test_getitem(self):
        templar = Templar()
        globals = {}
        locals = {}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(instance.__getitem__('varname'), None)

    def test_add_locals(self):
        templar = Templar()
        globals = {}
        locals = {}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(instance.add_locals(locals), instance)

if __name__ == '__main__':
    unittest.main()