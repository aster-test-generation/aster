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

    def test___contains__(self):
        templar = Templar()
        globals = {}
        locals = {}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(instance.__contains__('a'), False)

    def test___iter__(self):
        templar = Templar()
        globals = {}
        locals = {}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(instance.__iter__(), None)

    def test___len__(self):
        templar = Templar()
        globals = {}
        locals = {}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(instance.__len__(), None)

    def test___getitem__(self):
        templar = Templar()
        globals = {}
        locals = {}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(instance.__getitem__('a'), None)

    def test_add_locals(self):
        templar = Templar()
        globals = {}
        locals = {}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(instance.add_locals(locals), None)

if __name__ == '__main__':
    unittest.main()