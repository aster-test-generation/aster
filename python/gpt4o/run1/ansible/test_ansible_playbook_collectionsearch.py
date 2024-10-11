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
        result = _ensure_default_collection(['existing.collection'])
        self.assertIn('existing.collection', result)
        self.assertIn(AnsibleCollectionConfig.default_collection, ['existing.collection', 'ansible.legacy'])

    def test_ensure_default_collection_with_builtin(self):
        result = _ensure_default_collection(['ansible.builtin'])
        self.assertIn('ansible.builtin', result)
        self.assertNotIn('ansible.legacy', result)

    def test_ensure_default_collection_with_legacy(self):
        result = _ensure_default_collection(['ansible.legacy'])
        self.assertIn('ansible.legacy', result)
        self.assertNotIn('ansible.builtin', result)

class TestCollectionSearch(unittest.TestCase):
    def setUp(self):
        self.instance = CollectionSearch()

    def test_load_collections_with_none(self):
        result = self.instance.load_collections('collections', None)
        self.assertIsNone(result)

    def test_load_collections_with_empty_list(self):
        result = self.instance.load_collections('collections', [])
        self.assertIsNone(result)

    def test_load_collections_with_valid_list(self):
        result = self.instance.get_validated_value('collections', ['valid.collection'])
        self.assertIn('valid.collection', result)

    def test_load_collections_with_template_warning(self):
        with self.assertLogs('ansible.utils.display', level='WARNING') as cm:
            self.instance._load_collections('collections', ['{{ template }}'], validate=False)
            self.assertIn('WARNING:ansible.utils.display:"collections" is not templatable, but we found: {{ template }}, it will not be templated and will be used "as is".', cm.output)

if __name__ == '__main__':
    unittest.main()