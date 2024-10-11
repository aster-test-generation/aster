from ansible.template.yaml import AnsibleUndefinedVariabl
import unittest
from ansible.template.vars import AnsibleJ2Vars


class TestAnsibleJ2Vars(unittest.TestCase):
    def test_init(self):
        templar = object()  # mock templar object
        globals = {}
        locals = {}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(instance._templar, templar)
        self.assertEqual(instance._globals, globals)
        self.assertEqual(instance._locals, {})

    def test_contains(self):
        templar = object()  # mock templar object
        globals = {'foo': 'bar'}
        locals = {'baz': 'qux'}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertTrue('foo' in instance)
        self.assertTrue('baz' in instance)
        self.assertFalse('qux' in instance)

    def test_iter(self):
        templar = object()  # mock templar object
        globals = {'foo': 'bar', 'baz': 'qux'}
        locals = {'qux': 'quux'}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(set(instance), {'foo', 'baz', 'qux'})

    def test_len(self):
        templar = object()  # mock templar object
        globals = {'foo': 'bar', 'baz': 'qux'}
        locals = {'qux': 'quux'}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(len(instance), 3)

    def test_getitem(self):
        templar = object()  # mock templar object
        globals = {'foo': 'bar'}
        locals = {'baz': 'qux'}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(instance['foo'], 'bar')
        self.assertEqual(instance['baz'], 'qux')
        with self.assertRaises(KeyError):
            instance['qux']

    def test_add_locals(self):
        templar = object()  # mock templar object
        globals = {}
        locals = {'foo': 'bar'}
        instance = AnsibleJ2Vars(templar, globals, locals)
        new_locals = {'baz': 'qux'}
        new_instance = instance.add_locals(new_locals)
        self.assertEqual(new_instance._locals, {'foo': 'bar', 'baz': 'qux'})

    def test_private_method__templar_template(self):
        templar = object()  # mock templar object
        globals = {}
        locals = {}
        instance = AnsibleJ2Vars(templar, globals, locals)
        variable = object()  # mock variable object
        with self.assertRaises(AnsibleUndefinedVariable):
            instance._AnsibleJ2Vars__templar_template(variable)

if __name__ == '__main__':
    unittest.main()