import unittest
from youtube_dl.swfinterp import _AVMClass, _Undefined, _ScopeDict, _AVMClass_Object


class TestAVMClass(unittest.TestCase):
    def test_make_object(self):
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        obj = avm_class.make_object()
        self.assertIsInstance(obj, _AVMClass_Object)
        self.assertEqual(obj.class_name, avm_class.name)
        self.assertEqual(obj.class_idx, avm_class.name_idx)
        self.assertEqual(obj.scope, avm_class.variables)

    def test_register_methods(self):
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        avm_class.register_methods({'method_one': 1, 'method_two': 2})
        self.assertEqual(len(avm_class.method_names), 2)
        self.assertEqual(len(avm_class.method_idxs), 2)
        self.assertEqual(len(avm_class.methods), 2)
        self.assertEqual(len(avm_class.method_pyfunctions), 2)

class TestUndefined(unittest.TestCase):
    def test_undefined(self):
        self.assertIsInstance(undefined, _Undefined)
        self.assertEqual(str(undefined), 'undefined')
        self.assertEqual(repr(undefined), 'undefined')

class TestScopeDict(unittest.TestCase):
    def test_scope_dict(self):
        scope_dict = _ScopeDict(None)
        scope_dict['key'] = 'value'
        self.assertEqual(len(scope_dict), 1)
        self.assertEqual(scope_dict['key'], 'value')
        self.assertEqual(list(scope_dict.keys()), ['key'])
        self.assertEqual(list(scope_dict.values()), ['value'])
        self.assertEqual(list(scope_dict.items()), [('key', 'value')])
        self.assertEqual(scope_dict.get('key'), 'value')
        self.assertEqual(scope_dict.get('nonexistent_key'), None)
        self.assertEqual(scope_dict.get('nonexistent_key', 'default_value'), 'default_value')
        self.assertEqual(scope_dict.pop('key'), 'value')
        self.assertEqual(len(scope_dict), 0)
        with self.assertRaises(KeyError):
            scope_dict.pop('key')

class TestAVMClassObject(unittest.TestCase):
    def test_avm_class_object(self):
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        obj = avm_class.make_object()
        self.assertEqual(obj.class_name, avm_class.name)
        self.assertEqual(obj.class_idx, avm_class.name_idx)
        self.assertEqual(obj.scope, avm_class.variables)

if __name__ == '__main__':
    unittest.main()