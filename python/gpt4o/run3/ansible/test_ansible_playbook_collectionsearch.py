import unittest
from ansible.playbook.collectionsearch import CollectionSearch, _ensure_default_collection
from ansible.playbook.attribute import FieldAttribute
from ansible.utils.collection_loader import AnsibleCollectionConfig
from ansible.template import is_template, Environment
from ansible.utils.display import Display


class TestEnsureDefaultCollection(unittest.TestCase):
    def test_ensure_default_collection_with_none(self):
        result = _ensure_default_collection(None)
        self.assertIsNone(AnsibleCollectionConfig.default_collection)

    def test_ensure_default_collection_with_empty_list(self):
        result = _ensure_default_collection([])
        self.assertIsNone(AnsibleCollectionConfig.default_collection)

    def test_ensure_default_collection_with_existing_collection(self):
        collection_list = ['existing.collection']
        result = _ensure_default_collection(collection_list)
        self.assertIn('existing.collection', result)

    def test_ensure_default_collection_adds_ansible_legacy(self):
        collection_list = ['existing.collection']
        result = _ensure_default_collection(collection_list)
        self.assertIn('ansible.legacy', result)

class TestCollectionSearch(unittest.TestCase):
    def setUp(self):
        self.instance = CollectionSearch()

    def test_load_collections_with_empty_ds(self):
        result = self.instance.load_collections('collections', [])
        self.assertIsNone(result)

    def test_load_collections_with_valid_ds(self):
        ds = ['valid.collection']
        result = self.instance.load_collections('collections', ds)
        self.assertEqual(result, ds)

    def test_load_collections_with_template_warning(self):
        ds = ['{{ template }}']
        with self.assertLogs('ansible.utils.display', level='WARNING') as cm:
            self.instance._load_collections('collections', ds)
        self.assertIn('WARNING:ansible.utils.display:"collections" is not templatable, but we found: {{ template }}, it will not be templated and will be used "as is".', cm.output)

if __name__ == '__main__':
    unittest.main()