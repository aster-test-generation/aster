import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef



class Test_AnsiblePathHookFinder(unittest.TestCase):
    def test_find_module(self):
        instance = _AnsiblePathHookFinder()
        result = instance.find_module()
        self.assertEqual(result, None)

    def test_iter_modules(self):
        instance = _AnsiblePathHookFinder()
        result = instance.iter_modules()
        self.assertEqual(result, None)

    def test_repr(self):
        instance = _AnsiblePathHookFinder()
        result = instance.__repr__()
        self.assertEqual(result, None)

class Test_collection_finder(unittest.TestCase):
    def test_find_module(self):
        instance = _collection_finder()
        result = instance.find_module()
        self.assertEqual(result, None)

    def test_iter_modules(self):
        instance = _collection_finder()
        result = instance.iter_modules()
        self.assertEqual(result, None)

    def test_repr(self):
        instance = _collection_finder()
        result = instance.__repr__()
        self.assertEqual(result, None)

class Test_AnsibleCollectionRef(unittest.TestCase):
    def test_init(self):
        instance = AnsibleCollectionRef()
        result = instance.__init__()
        self.assertEqual(result, None)

    def test_repr(self):
        instance = AnsibleCollectionRef()
        result = instance.__repr__()
        self.assertEqual(result, None)

    def test_eq(self):
        instance = AnsibleCollectionRef()
        result = instance.__eq__()
        self.assertEqual(result, None)

class Test_AnsibleCollectionConfig(unittest.TestCase):
    def test_init(self):
        instance = AnsibleCollectionConfig()
        result = instance.__init__()
        self.assertEqual(result, None)

    def test_repr(self):
        instance = AnsibleCollectionConfig()
        result = instance.__repr__()
        self.assertEqual(result, None)

    def test_eq(self):
        instance = AnsibleCollectionConfig()
        result = instance.__eq__()
        self.assertEqual(result, None)

class Test_AnsibleCollectionRefSpec(unittest.TestCase):
    def test_init(self):
        instance = AnsibleCollectionRefSpec()
        result = instance.__init__()
        self.assertEqual(result, None)

    def test_repr(self):
        instance = AnsibleCollectionRefSpec()
        result = instance.__repr__()
        self.assertEqual(result, None)

    def test_eq(self):
        instance = AnsibleCollectionRefSpec()
        result = instance.__eq__()
        self.assertEqual(result, None)

class Test_AnsibleCollectionRefSpecSet(unittest.TestCase):
    def test_init(self):
        instance = AnsibleCollectionRefSpecSet()
        result = instance.__init__()
        self.assertEqual(result, None)

    def test_repr(self):
        instance = AnsibleCollectionRefSpecSet()
        result = instance.__repr__()
        self.assertEqual(result, None)

    def test_eq(self):
        instance = AnsibleCollectionRefSpecSet()
        result = instance.__eq__()
        self.assertEqual(result, None)

class Test_AnsibleCollectionRefSpecList(unittest.TestCase):
    def test_init(self):
        instance = AnsibleCollectionRefSpecList()
        result = instance.__init__()
        self.assertEqual(result, None)

    def test_repr(self):
        instance = AnsibleCollectionRefSpecList()
        result = instance.__repr__()
        self.assertEqual(result, None)

    def test_eq(self):
        instance = AnsibleCollectionRefSpecList()
        result = instance.__eq__()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()