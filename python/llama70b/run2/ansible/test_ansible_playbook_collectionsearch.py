import unittest
from ansible_collections.ansible.playbook.collectionsearch import CollectionSearch, _ensure_default_collectio


class TestCollectionSearch(unittest.TestCase):
    def test_init(self):
        instance = CollectionSearch()
        self.assertIsInstance(instance, CollectionSearch)

    def test_collections_attribute(self):
        instance = CollectionSearch()
        self.assertIsInstance(instance._collections, FieldAttribute)

    def test_load_collections(self):
        instance = CollectionSearch()
        ds = ['collection1', 'collection2']
        result = instance._load_collections(None, ds)
        self.assertEqual(result, ds)

    def test_load_collections_with_template(self):
        instance = CollectionSearch()
        env = Environment()
        ds = ['{{ collection1 }}', 'collection2']
        result = instance._load_collections(None, ds)
        self.assertEqual(result, ds)
        self.assertIn('warning', display.messages)

    def test_load_collections_with_no_collections(self):
        instance = CollectionSearch()
        result = instance._load_collections(None, [])
        self.assertIsNone(result)

    def test_ensure_default_collection(self):
        collection_list = []
        result = _ensure_default_collection(collection_list)
        self.assertIn(AnsibleCollectionConfig.default_collection, result)

    def test_ensure_default_collection_with_legacy(self):
        collection_list = ['collection1']
        result = _ensure_default_collection(collection_list)
        self.assertIn('ansible.legacy', result)

    def test_str_method(self):
        instance = CollectionSearch()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = CollectionSearch()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = CollectionSearch()
        instance2 = CollectionSearch()
        self.assertEqual(instance1, instance2)

    def test_private_method(self):
        instance = CollectionSearch()
        result = instance._CollectionSearch__load_collections(None, ['collection1'])
        self.assertEqual(result, ['collection1'])

if __name__ == '__main__':
    unittest.main()